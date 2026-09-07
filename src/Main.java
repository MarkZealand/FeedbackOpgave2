import java.util.Scanner;

void main() {
// Trin 1
    Scanner input = new Scanner(System.in);

    System.out.print("Hvilken tid på dagen? (Dag/Aften/Nat)");
    String time = input.nextLine();

    System.out.print("Hvor stor trafikmængde? (Lav/Høj)");
    String traffic = input.nextLine();

    System.out.print("Hvilken områdetype? (Bolig/Erhverv/Blandet)");
    String area = input.nextLine();

    System.out.print("Er det en nødsituation? (Ja/Nej)");
    String emergency = input.nextLine();

    System.out.print("Har en fodgænger trykket på knappen? (Ja/Nej)");
    String pedestrianButton = input.nextLine();

// Trin 2
    boolean isDay = time.equalsIgnoreCase("Dag");
    boolean isEvening = time.equalsIgnoreCase("Aften");
    boolean isNight = time.equalsIgnoreCase("Nat");
    boolean isLowTraffic = traffic.equalsIgnoreCase("Lav");
    boolean isHighTraffic = traffic.equalsIgnoreCase("Høj");
    boolean isResidential = area.equalsIgnoreCase("Bolig");
    boolean isCommercial = area.equalsIgnoreCase("Erhverv");
    boolean isMixed = area.equalsIgnoreCase("Blandet");
    boolean isEmergency = emergency.equalsIgnoreCase("Ja");
    boolean isPedestrianButton = pedestrianButton.equalsIgnoreCase("Ja");
// Trin 3
    String trafficLightColor = "";

    //1. prio
    if (isEmergency) {
        trafficLightColor = "GRØNT";
    }
    //1½. prio (NYLIGT TILFØJET)
    else if (isPedestrianButton && isResidential) {
        trafficLightColor = "GRØNT";
    }
    //2. prio
    else if ((isNight || isCommercial) && isHighTraffic) {
        trafficLightColor = "RØDT";
    }
    //3. prio
    else if (isEvening || (isNight && isLowTraffic)) {
        trafficLightColor = "GULT";
    }
    //4. prio
    else if (isDay && isLowTraffic) {
        trafficLightColor = "GRØNT";
    }
    //5. hvis ingen af ovenstående, så default til rødt lys
    else {
        trafficLightColor = "RØDT";
    }

    // Vi tjekker efter nødsituation først, for at undgå at eksekvere unødvendig kode, da nødsituation har første prioritet og altid skal overskrive alle andre muligheder.

    // Trin 6
    String adgangTilladt = "";
    if (isResidential && isNight)
        adgangTilladt = "FORBUDT";
    else if ((isCommercial || isMixed) && isLowTraffic)
        adgangTilladt = "TILLADT";
    else
        adgangTilladt = "FORBUDT";

    // Trin 11 - Egen tilføjelse til systemet


    //Bonus
    String visualTrafficLight = "";

    switch (trafficLightColor) {
        case "GRØNT":
            visualTrafficLight = "[🟢]";
            break;
        case "GULT":
            visualTrafficLight = "[🟡]";
            break;
        case "RØDT":
            visualTrafficLight = "[🔴]";
            break;
        default:
            visualTrafficLight = "[🔴]";
            break;
    }


    // Trin 8
    System.out.println("=============================");
    System.out.println("========TRAFIKCENTRAL========");
    System.out.println("=============================");
    System.out.println("Tidspunkt: " + time);
    System.out.println("Trafikmængde: " + traffic);
    System.out.println("Områdetype: " + area);
    System.out.println("Nødsituation: " + emergency + "\n");
    System.out.println("Trafiklys: " + trafficLightColor + " " + visualTrafficLight);
    System.out.println("Adgang: " + adgangTilladt);
    System.out.println("=============================");

    // Trin 9
    // dag i blandet område med lav trafikmængde
    // aften i blandet område med høj trafikmængde


}

void TestOpgave() {
    String userType = "admin";
    int level = 25;
    if (userType.equalsIgnoreCase("admin")) {
        System.out.println("Administrator fundet");
    } else if (level >= 20) {
        System.out.println("Erfaren spillet fundet");
    } else {
        System.out.println("Ny spiller");
    }
}


























