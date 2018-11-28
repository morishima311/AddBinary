class Solution{
    public static String addBinary(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0){
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0){
                sum += b.charAt(j--) - '0';
            }
            sb.insert(0, sum % 2);
            carry = sum / 2;
       }
       if (carry > 0){
           sb.insert(0, 1);
       }
       return sb.toString();
    }

    public static void main(String[] args){
        if(args.length != 2){
                System.out.println("Proper Usage: <java> <program> <binary1> <binary2>");
                System.exit(1);
        }
        for (int i=0; i<args[0].length(); i++){
            if (args[0].charAt(i) != '0' && args[0].charAt(i) != '1'){
                System.out.println("Invalid arguments");
                System.exit(1);
            }
        }
        for (int i=0; i<args[1].length(); i++){
            if (args[1].charAt(i) != '0' && args[1].charAt(i) != '1'){
                System.out.println("Invalid arguments");
                System.exit(1);
            }
        }
        System.out.println(addBinary(args[0], args[1]));
    }
}
