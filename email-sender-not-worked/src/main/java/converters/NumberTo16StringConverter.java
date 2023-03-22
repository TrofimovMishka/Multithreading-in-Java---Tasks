package converters;

class NumberTo16StringConverter {
    public static void main(String[] args) {
        int toConvert = 12;

        String convertedTo16String = Integer.toHexString(toConvert);
        System.out.println("hex string: " + convertedTo16String);

        String convertedTo8String = Integer.toOctalString(toConvert);
        System.out.println("octal string: " + convertedTo8String);

        String convertedTo2String = Integer.toBinaryString(toConvert);
        System.out.println("binary string: " + convertedTo2String);

    }
}
