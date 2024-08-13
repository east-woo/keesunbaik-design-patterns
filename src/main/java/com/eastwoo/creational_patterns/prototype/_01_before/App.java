package com.eastwoo.creational_patterns.prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        //GithubIssue clone = githubIssue.clone();


        // TODO clone != githubIssue -> 같지 않다 이유는 레퍼런스가 다르기 때문에
        // TODO clone.equals(githubIssue) -> 값이 같으므로 True이다.
    }

}
