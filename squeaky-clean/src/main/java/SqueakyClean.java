class SqueakyClean {
    static String clean(String identifier) {
        var mystring  = new StringBuilder();
        boolean mybloon = false;
        for (char c: identifier.toCharArray()) {
            if (c == ' ') {
                mystring.append('_');
                mybloon = false;
            }
            else if (c == '-')
                mybloon = true;
            else if (Character.isISOControl(c))
                mystring.append("CTRL");
            else if ((c < 0x3B1 || c > 0x3C9) && Character.isLetter(c)) {
                if (mybloon)
                    c = Character.toUpperCase(c);
                mystring.append(c);
                mybloon = false;
            }
        }
        return mystring.toString();
    }
}