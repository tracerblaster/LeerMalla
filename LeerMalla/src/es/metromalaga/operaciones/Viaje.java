package es.metromalaga.operaciones;

import java.time.LocalTime;

public class Viaje {

	enum Estaciones {PDD, PBL, LZP, TOR, PRI, ISL, PCH, LUN, BBL, CRR, PTD, CDJ, UNI, CLI, CNS, PRF, TCH};
	
	int tripNumber;
	int tripId;
	int serviceId;
	String direction;
	LocalTime entryTime;
	int distance;
	int trainClass;
	String missionType;
	String runningMode;
	String crewId;
	String nextCrewId;
	String nextCrewIdLocation;
	String RollingStockId;
	int previousNumber;
	int nextNumber;

}
