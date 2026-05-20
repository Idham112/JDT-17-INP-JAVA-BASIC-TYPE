package com.indivaragroup.jav.logic;

import com.indivaragroup.jav.dto.JavDTO;

import java.util.ArrayList;

public class JavLogic {
    public static void javLogic(){
        ArrayList<JavDTO> remuCodes = new ArrayList<>();
        ArrayList<JavDTO> newRemuCodes = new ArrayList<>();

        JavDTO movie1 = new JavDTO();
        movie1.setReleaseCode("STAR-001");
        movie1.setReleaseDate("2018-05-20");
        remuCodes.add(movie1);

        JavDTO movie2 = new JavDTO();
        movie2.setReleaseCode("STAR-002");
        movie2.setReleaseDate("2020-03-15");
        remuCodes.add(movie2);

        JavDTO movie3 = new JavDTO();
        movie3.setReleaseCode("STAR-003");
        movie3.setReleaseDate("2023-11-02");
        remuCodes.add(movie3);

        JavDTO movie4 = new JavDTO();
        movie4.setReleaseCode("STAR-004");
        movie4.setReleaseDate("2026-05-20");
        remuCodes.add(movie4);

        for(JavDTO remuCode : remuCodes){
            if(remuCode.getReleaseDate().compareTo("2026-01-01") < 0){
                newRemuCodes.add(remuCode);
                System.out.println(remuCode.getReleaseCode());
            }
        }
    }
}
