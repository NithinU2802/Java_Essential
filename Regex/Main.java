class Main{
    public static void main(String[] arg){
        String s="Hellello";
        // matches(), split(), replaceFirst() and replaceAll()
        System.out.println(s.matches("\\w+"));
        System.out.println(s.split("e")[1]);
        System.out.println(s.replaceFirst("ll","oo"));
        System.out.println(s.replace("ll","oo"));
        System.out.println(s.replaceAll("ll","oo"));

        // Lets write code for domain mail : nithinu@gmail.com
        String regex="[a-z0-9]+(@)(gmail|yahoo|krct)[.](com|in|org)";
        System.out.println("nithinu@gmail.com".matches(regex));
    }
}