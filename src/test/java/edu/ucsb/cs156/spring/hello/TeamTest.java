package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;
    Team team3;
    Team team4;
    Team team5;
    Team team6;
    int testNum = 100;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");  
        team2 = new Team("test-team2"); 
        team3 = new Team("test-team3");
        team4 = new Team("test-team");
        team5 = new Team("team-16");
        team6 = new Team("team-16");
        team5.addMember("Tutam");
        team6.addMember("Tatum");
        team3.addMember("Tatum");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   @Test
   public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
   }

   @Test
   public void equals_tests_same_object_true() {
        assertEquals(true, team.equals(team));
   }

   @Test
   public void equals_invalidates_obj_outside_of_class() {
        assertEquals(false, team.equals(testNum));
   }
   
   @Test
   public void equals_compares_other_obj_false() {
        assertEquals(false, team.equals(team2));
   }

   @Test
   public void equals_compares_other_obj_true() {
        assertEquals(true, team.equals(team4));
   }

   @Test
   public void equals_compares_same_Team_Name_Different_Members() {
        assertEquals(false, team5.equals(team6));
   }

    @Test
    public void hashCode_gives_expected() {
        int result = team3.hashCode();
        int expectedResult = 652065919;
        assertEquals(expectedResult, result);
    }
}
