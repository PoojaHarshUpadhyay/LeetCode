class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String result = "";

        HashMap<String, Integer> map = new HashMap<>();
        String aa = paragraph.toLowerCase().replaceAll("[^a-z]", " ").replace("  ", " ");
        String[] originalPara = aa.split(" ");

        for (int i = 0; i < originalPara.length; i++) {
            if (map.containsKey(originalPara[i])) {
                int count = map.get(originalPara[i]);
                count = count + 1;
                map.put(originalPara[i], count);
            } else {
                map.put(originalPara[i], 1);

            }
        }

        for (int i = 0; i < banned.length; i++) {
            for (int j = 0; j < map.size(); j++) {
                if (map.containsKey(banned[i])) {
                    map.put(banned[i], 0);
                }
            }
        }

        result = Collections.max(map.entrySet(),        Map.Entry.comparingByValue()).getKey();

        return result;
    }
}
