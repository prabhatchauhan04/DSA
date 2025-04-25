package String;

// String aur StringBuilder ki speed ka comparison.
// We know StringBuilder fast h bohot comparatively but still we will see kitna farak aata.
// Ek ek krke dono chala kr dekhlo 
// but StringBuilder Code run krte hi shuru krdega print krna and 
// String humara boht sare minutes tk compute hi krta rahega String ki value

public class StringVsStringBuilder {
    public static void main(String[] args) {
            // String_Demo();
            StringBulider_Demo();
    }
    public static void String_Demo() {
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += i;
        }
        System.out.println(s);
    }

    public static void StringBulider_Demo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}



