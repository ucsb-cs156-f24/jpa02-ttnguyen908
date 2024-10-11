package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Tiffany";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "ttnguyen908";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-16");
        team.addMember("Rohan");
        team.addMember("Shriaan");
        team.addMember("Kelly");
        team.addMember("Claire");
        team.addMember("Jayden");
        team.addMember("Tiffany");
        return team;
    }
}
