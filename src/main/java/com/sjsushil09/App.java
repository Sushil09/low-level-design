package com.sjsushil09;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

//@Slf4j
public class App {
    public static void main(String[] args) {
//        Map<Integer, Player> map = new TreeMap<>(Comparator.reverseOrder());



    }
}

class LeaderBoard{
    Set<Player> set;

    public LeaderBoard(Set<Player> set) {
        this.set = new TreeSet<>((o1, o2) -> o2.score - o1.score);
    }


}
class Player {
    int id;
    String name;
    int score;

    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && score == player.score && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}