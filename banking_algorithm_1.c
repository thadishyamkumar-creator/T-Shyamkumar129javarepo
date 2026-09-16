#include <stdio.h>

#define PROCESS 5
#define RESOURCE 4

int main()
{
    int allocation[PROCESS][RESOURCE] = {
        {0, 0, 1, 2},
        {2, 0, 0, 0},
        {0, 0, 3, 4},
        {2, 3, 5, 4},
        {0, 3, 3, 2}
    };

    int maximum[PROCESS][RESOURCE] = {
        {0, 0, 1, 2},
        {2, 7, 5, 0},
        {6, 6, 5, 6},
        {4, 3, 5, 6},
        {0, 6, 5, 2}
    };

    int available[RESOURCE] = {2, 1, 0, 0};

    int need[PROCESS][RESOURCE];
    int completed[PROCESS] = {0};
    int safeSequence[PROCESS];

    int i, j;
    int finished = 0;
    int found;

    printf("Need Matrix:\n");

    for (i = 0; i < PROCESS; i++)
    {
        for (j = 0; j < RESOURCE; j++)
        {
            need[i][j] = maximum[i][j] - allocation[i][j];
            printf("%d ", need[i][j]);
        }
        printf("\n");
    }

    while (finished < PROCESS)
    {
        found = 0;

        for (i = 0; i < PROCESS; i++)
        {
            if (completed[i] == 0)
            {
                for (j = 0; j < RESOURCE; j++)
                {
                    if (need[i][j] > available[j])
                    {
                        break;
                    }
                }

                if (j == RESOURCE)
                {
                    for (j = 0; j < RESOURCE; j++)
                    {
                        available[j] += allocation[i][j];
                    }

                    safeSequence[finished] = i;
                    finished++;
                    completed[i] = 1;
                    found = 1;
                }
            }
        }

        if (found == 0)
        {
            break;
        }
    }

    if (finished == PROCESS)
    {
        printf("\nSystem is in SAFE state.\n");
        printf("Safe Sequence: ");

        for (i = 0; i < PROCESS; i++)
        {
            printf("P%d ", safeSequence[i] + 1);
        }

        printf("\n");
    }
    else
    {
        printf("\nSystem is in UNSAFE state.\n");
        printf("Deadlock may occur.\n");

        printf("Processes unable to finish: ");

        for (i = 0; i < PROCESS; i++)
        {
            if (completed[i] == 0)
            {
                printf("P%d ", i + 1);
            }
        }

        printf("\n");
    }

    return 0;
}

