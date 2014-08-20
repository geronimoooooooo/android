	public void pingTheServer2(View v){
				//ohne die 2 folgenden Zeilen würde es nicht gehen. Kann wohl nicht im gleichen Thread UI + Internetanfrage machen
		StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
		StrictMode.setThreadPolicy(policy);
		
		BufferedReader reader = null;
		String urlString2 ="http://ispacevm16.researchstudio.at/ArcGIS/rest/services/haufe/GetQuestion/MapServer/0/query?" +
						"text=&geometry=&geometryType=esriGeometryPoint&inSR=&spatialRel=esriSpatialRelIntersects&relationParam=&" +
						"objectIds=3&where=&time=&returnCountOnly=false&returnIdsOnly=false&returnGeometry=true&maxAllowableOffset=&" +
						"outSR=&outFields=&f=json";
		String urlString="http://ispacevm26.researchstudio.at:6080/arcgis/rest/services/assist/beacon_map/MapServer/0/query?where=&text=&objectIds=1&f=pjson";

		try {
			// --------------------------------------
			// Set up the URL as String
			URL url = new URL(urlString);
			System.out.println("----------------------------------- call URL -------------------------------------");
			System.out.println(urlString);
		
			// --------------------------------------
			// Initialize BufferedReader and StringBuffer
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			System.out.println("inputstream vorbei: ");
		
			// Set up int and char for iterating through the json byte by byte
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			// --------------------------------------
			// Definition of Console Output
			System.out.println("-------------------------------- Begin Read JSON ----------------------------------");
			System.out.println(buffer.toString());
			System.out.println("");
			
			// --------------------------------------
			// Return Value
			String ServerResponse = buffer.toString();
			tv.setText(ServerResponse);

			// --------------------------------------
			// The finally closing tag
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}	
