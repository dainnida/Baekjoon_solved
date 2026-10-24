class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String skill_tree : skill_trees) {
            String filtered_skill = "";
            for (int i = 0; i < skill_tree.length(); i++) {
                if (skill.contains(skill_tree.charAt(i) + ""))
                    filtered_skill += skill_tree.charAt(i) + "";
            }
            if (skill.startsWith(filtered_skill))
                answer++;
        } 
        return answer;
    }
}