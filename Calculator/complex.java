class Complex {
    static String complexAdd(String a, String b) {
        Integer real_num1 = Integer.parseInt(a.substring(0, a.indexOf('+')));
        Integer imaginary_num1 = Integer.parseInt(a.substring(a.indexOf('+'), a.indexOf('i')));
        Integer real_num2 = Integer.parseInt(b.substring(0, b.indexOf('+')));
        Integer imaginary_num2 = Integer.parseInt(b.substring(b.indexOf('+'), a.indexOf('i')));
        
        return (real_num1 + real_num2) + " + " + (imaginary_num1 + imaginary_num2) + "i";
    }

    static String complexSubtraction(String a, String b) {
        Integer real_num1 = Integer.parseInt(a.substring(0, a.indexOf('+')));
        Integer imaginary_num1 = Integer.parseInt(a.substring(a.indexOf('+'), a.indexOf('i')));
        Integer real_num2 = Integer.parseInt(b.substring(0, b.indexOf('+')));
        Integer imaginary_num2 = Integer.parseInt(b.substring(b.indexOf('+'), a.indexOf('i')));
        
        return (real_num1 - real_num2) + " + " + (imaginary_num1 - imaginary_num2) + "i";
    }

    static String complexMultiplication(String a, String b) {
        Integer real_num1 = Integer.parseInt(a.substring(0, a.indexOf('+')));
        Integer imaginary_num1 = Integer.parseInt(a.substring(a.indexOf('+'), a.indexOf('i')));
        Integer real_num2 = Integer.parseInt(b.substring(0, b.indexOf('+')));
        Integer imaginary_num2 = Integer.parseInt(b.substring(b.indexOf('+'), a.indexOf('i')));
        
        return ((real_num1 * real_num2) - (imaginary_num1 * imaginary_num2)) + "+" + ((real_num1 * imaginary_num2) + (imaginary_num1 * real_num2)) + "i";
    }

    static String complexDivision(String a, String b) {
        Integer real_num1 = Integer.parseInt(a.substring(0, a.indexOf('+')));
        Integer imaginary_num1 = Integer.parseInt(a.substring(a.indexOf('+'), a.indexOf('i')));
        Integer real_num2 = Integer.parseInt(b.substring(0, b.indexOf('+')));
        Integer imaginary_num2 = Integer.parseInt(b.substring(b.indexOf('+'), a.indexOf('i')));
        
        try {
            return (((real_num1 + real_num2) + (imaginary_num1 + imaginary_num2)) / ((imaginary_num1 * imaginary_num1) + (imaginary_num2 * imaginary_num2))) + "+" + (((imaginary_num1 * real_num2) - (real_num1 * imaginary_num2)) / ((imaginary_num1 * imaginary_num1) + (imaginary_num2 * imaginary_num2))) + "i";
        } catch (Exception e) {
            return "Number not allowed";
        }
    }

    public static void main(String[] args) {
        String a = "1+28i";
        String b = "16+5i";
        System.out.println("Addition:" + complexAdd(a, b));
        System.out.println("Subtraction:" + complexSubtraction(a, b));
        System.out.println("Multiplication:" + complexMultiplication(a, b));
        System.out.println("Division:" + complexDivision("1+3i", "1+2i"));
    }
}

