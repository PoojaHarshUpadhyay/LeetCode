 public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();

        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ')' && open == 0) {
                continue;
            }

            if (c == '(') {
                open++;
            }
            if (c == ')') {
                open--;
            }

            sb.append(c);
        }

        StringBuilder sb2 = new StringBuilder();

        for (int i = sb.length() - 1; i >= 0; i--) {
            char c2 = sb.charAt(i);
            if (c2 == '(' && open >= 0) {
                open--;
                continue;
            }
            sb2.append(c2);
        }
        String result = sb2.reverse().toString();
        return result;
    }
