package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private Set<HealthcareServiceable> teamMembers = new HashSet<>();

    public void addMember(HealthcareServiceable member){
        teamMembers.add(member);
    }

    public void removeMember(HealthcareServiceable member){
        teamMembers.remove(member);
    }

    public void service(){
        for (HealthcareServiceable healthcareServiceable : teamMembers) {
            healthcareServiceable.service();
        }
    }

    public double getPrice(){
        double total = 0;
        for (HealthcareServiceable healthcareServiceable : teamMembers) {
            total += healthcareServiceable.getPrice();
        }
        return total;
    }
}
