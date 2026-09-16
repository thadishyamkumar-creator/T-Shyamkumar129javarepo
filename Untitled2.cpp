#include <stdio.h>
#define Max 5
int queue[Max];
int priority[Max];
int n =0 ;  
void insert()
{ 
    int value,p ;
	if (n==Max)
	{
		printf("The queue is Full ");
		return ;		
	}
	printf(" Enter the value ");
	scanf ("%d",&value);
	printf(" Enter the priority ");
	scanf("%d",&p);
	queue[n]=value;
	priority[n]=p;
	n++;
	printf(" The Elements are inserted Successfully ");
}
void deletemin()
{ 
  int i, pos=0 ;
  if (n==0)
  { 
  printf("The queue is Empty ");
  }
  for(i=1;i<n;i++)
  { 
    if (priority[i]<priority[pos]){
    	  pos=i;
	}
  
  }
   printf ( " Deleted Element  %d ",queue[pos]);
   for(i=pos;i<n-1;i++)
   {
   	  queue[i]= queue[i+1];
	  priority[i]=priority[i+1] ; 
   }  
   n--;
}
void display ()
{  
  int i ; 
  if(n==0) 
  {
  	printf(" Queue is empty ");
  	return ; 
  }
  printf("The Elements in the queue and their prioritys ");
  for(i=0;i<n;i++)
  { 
     printf( "  %d %d ",queue[i],priority[i]);
  }
}
 int main ()
 { 
   int choice ;
    while (1)
    { 
      printf(" The Priority Queue ");
      printf(" 1. Insert ");
      printf(" 2. delete ");
      printf("3. display ");
      printf(" 4. exit ");
      printf(" Enter the choice ");
      scanf("%d",&choice);
      switch(choice)
      { 
        case 1 : insert ();
                 break ;
        case 2 : deletemin();
                 break ; 
        case 3 : display ();
                 break ;
        case 4 : return 0 ;
        default : 
          printf(" Entered Invalid choice \n ");	  
		  }
	}
 }

