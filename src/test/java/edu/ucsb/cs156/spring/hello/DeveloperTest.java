package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Tiffany", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("ttnguyen908", Developer.getGithubId());
    }

    @Test 
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("f24-16", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Jayden() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Jayden"),"Team should contain Jayden");
    }

    @Test
    public void getTeam_returns_team_with_Rohan() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Rohan"),"Team should contain Rohan");
    }

    @Test
    public void getTeam_returns_team_with_Kelly() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Kelly"),"Team should contain Kelly");
    }

    @Test
    public void getTeam_returns_team_with_Shriaan() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Shriaan"),"Team should contain Shriaan");
    }

    @Test
    public void getTeam_returns_team_with_Claire() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Claire"),"Team should contain Claire");
    }

    @Test
    public void getTeam_returns_team_with_Tiffany() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Tiffany"),"Team should contain Tiffany");
    }
}
