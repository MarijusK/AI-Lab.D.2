package org.org.examples.Lab2;

import org.org.examples.Lab2.Classes.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.org.examples.Lab2.Classes.*;

public class Start {
    public static void main(String[] args) {
        // Inicijuojame Drools variklį
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        Soil soil = new Soil(5, 3.0);  // Maža drėgmė, rūgštus pH
        Weather weather = new Weather(20, false);  // Karštas oras, be lietaus

                /*
       Augalų tipai:
Kukurūzai
Kviečiai
Rapsai
Bulvės
Morkos
Ropės
Burokėliai

Augalų būklė:
Sveikas
Sergantis
Kenkėjų pažeistas
Maistinių medžiagų trūkumas
Vandens trūkumas
Perlaistytas
Stresas dėl temperatūros
         */

        // Sukuriame masyvą su augalų objektais
        Plant[] plants = new Plant[]{
                new Plant("Kviečiai", "Sergantis"),
        };

        IrrigationSystem irrigationSystem = new IrrigationSystem();
        FarmerActions farmerActions = new FarmerActions();
        Recommendation recommendation = new Recommendation();

        // Įdedame objektus į Drools sesiją
        kSession.insert(soil);
        kSession.insert(weather);
        for (Plant plant : plants) {
            kSession.insert(plant);  // Įdedame visus augalus iš masyvo
        }
        kSession.insert(irrigationSystem);
        kSession.insert(farmerActions);
        kSession.insert(recommendation);

        // Vykdome taisykles
        kSession.fireAllRules();

        // Uždaryti sesiją
        kSession.dispose();
    }
}