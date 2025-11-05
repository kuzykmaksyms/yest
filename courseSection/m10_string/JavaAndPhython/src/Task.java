
public class Task {
    public static void main(String[] args) {
        System.out.println(sameCount("We study java not python"));
        System.out.println(sameCount("What's the difference between java, javascript and python?"));
        System.out.println(sameCount("java python hello python world python"));

    }

    public static boolean sameCount(String str) { // We study java not python

        int java = 0;
        int python = 0;
        int length = str.length();
        //Write your solution here
        str = str.toLowerCase();

        for (int i = 0; i <= length - 4; i++) {
            if (str.substring(i, i + 4).equals("java")) {
                java++;
            }
        }

        for (int i = 0; i <= length - 6; i++) {
            if (str.substring(i, i + 6).equals("python")) {
                python++;
            }
        }
        return java == python;
    }
}