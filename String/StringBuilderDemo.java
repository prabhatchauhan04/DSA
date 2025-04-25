package String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("Bye");
		sb.append("HelloBye");
		sb.append(1);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.delete(0, 5));
		System.out.println(sb);
		String s = sb.toString();
		System.out.println(sb.substring(4));
		System.out.println(sb.substring(4,7));
		System.out.println(sb.reverse());
		System.out.println(sb);
    }
}
