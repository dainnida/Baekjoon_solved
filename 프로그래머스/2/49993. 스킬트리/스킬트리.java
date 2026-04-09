class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for (String tree : skill_trees) {
            String filtered_skills = "";
            for (int i=0; i<tree.length(); i++) {
                if (skill.contains(tree.charAt(i)+""))
                    filtered_skills += tree.charAt(i);
            }
            if (filtered_skills.equals(skill.substring(0, filtered_skills.length())))
                answer++;
        }
        return answer;
    }
}