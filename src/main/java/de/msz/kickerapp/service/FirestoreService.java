package de.msz.kickerapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FirestoreService {

    private final Logger log = LoggerFactory.getLogger(FirestoreService.class);
/*
private Firestore db;
    
    private Map<String, Player> players = new HashMap<>();
    
	public Map<String, Player> getPlayers() {
		return players;
	}
	
	@PostConstruct
	private void init() throws IOException {
		db = getFirestore();
		initPlayers();
	}
	
	private Firestore getFirestore() throws IOException {
		
		InputStream serviceAccount;
		
		File firestoreConfFile = new File("src\\\\main\\\\resources\\\\mszkicker-firestore-conf.json");
		if (firestoreConfFile.exists()) {	// local configuration file
			serviceAccount = new FileInputStream(firestoreConfFile);
		} else {							// environment variable FIREBASE_CONFIG for cloud deployment
			String serviceAccountJson = System.getenv("SERVICE_ACCOUNT_JSON");
			serviceAccount = new ByteArrayInputStream(serviceAccountJson.getBytes(StandardCharsets.UTF_8));
		}
		
		GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(credentials)
				.build();
		FirebaseApp.initializeApp(options);
		
		return FirestoreClient.getFirestore();
	}
	
	private void initPlayers() {
		
		db.collection("spieler").addSnapshotListener(new EventListener<QuerySnapshot>() {
			
			@Override
			public void onEvent(QuerySnapshot querySnapshot, FirestoreException error) {
				
				querySnapshot.getDocumentChanges().forEach(change -> {
					QueryDocumentSnapshot document = change.getDocument();
					Player player = new Player();
					player.setId(document.getId());
					player.setName(document.getString("name"));
					players.put(player.getId(), player);
				});
			}
		});
	}*/
}
