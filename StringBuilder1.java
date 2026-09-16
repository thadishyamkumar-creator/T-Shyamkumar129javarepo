class StringBuilder1
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, ",");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0, 6);
        System.out.println(sb);

        sb.replace(0, 1, "!");
        System.out.println(sb);
    }
}