package ths.learnjp.katahira;

public class UserModel {

    private int user_id;
    private String name;
    private String rank;
    private int perfect_kata;
    private int perfect_hira;
    private int greetings;
    private int phrases;

    public UserModel(int user_id, String name, String rank, int perfect_kata, int perfect_hira, int greetings, int phrases) {
        this.user_id = user_id;
        this.name = name;
        this.rank = rank;
        this.perfect_kata = perfect_kata;
        this.perfect_hira = perfect_hira;
        this.greetings = greetings;
        this.phrases = phrases;
    }

    @Override
    public String toString() {
        return "UserModel{" + "user_id=" + user_id + ", name='" + name + '\'' + ", rank='" + rank + '\'' + ", perfect_kata=" + perfect_kata + ", perfect_hira=" + perfect_hira + ", greetings=" + greetings + ", phrases=" + phrases + '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getPerfect_kata() {
        return perfect_kata;
    }

    public void setPerfect_kata(int perfect_kata) {
        this.perfect_kata = perfect_kata;
    }

    public int getPerfect_hira() {
        return perfect_hira;
    }

    public void setPerfect_hira(int perfect_hira) {
        this.perfect_hira = perfect_hira;
    }

    public int getGreetings() {
        return greetings;
    }

    public void setGreetings(int greetings) {
        this.greetings = greetings;
    }

    public int getPhrases() {
        return phrases;
    }

    public void setPhrases(int phrases) {
        this.phrases = phrases;
    }
}
