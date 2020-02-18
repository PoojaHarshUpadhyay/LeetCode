   boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');

        Stack<Character> stack = new Stack<>();
        if (s.length() > 0) {
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (!mappings.containsKey(c[i])) {
                    char sc = stack.isEmpty() ? '#' : stack.pop();
                    if (!mappings.containsKey(sc) || !mappings.get(sc).equals(c[i])) {
                        stack.push(c[i]);
                    }
                } else {
                    stack.push(c[i]);
                }
            }
        } else {
            return false;
        }

        return stack.isEmpty();
    }
