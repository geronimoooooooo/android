private static String readUrl(String urlString) throws Exception {
				BufferedReader reader = null;
				
				try {
					// --------------------------------------
					// Set up the URL as String
					URL url = new URL(urlString);
					System.out.println("----------------------------------- call URL -------------------------------------");
					System.out.println("URL for calling JSONString: ");
					System.out.println(urlString);
					System.out.println("");
					
					// --------------------------------------
					// Initialize BufferedReader and StringBuffer
					reader = new BufferedReader(new InputStreamReader(url.openStream()));
					StringBuffer buffer = new StringBuffer();
					// --------------------------------------
					
					// --------------------------------------
					// Set up int and char for iterating through the json byte by byte
					int read;
					char[] chars = new char[1024];
					while ((read = reader.read(chars)) != -1)
						buffer.append(chars, 0, read);

					// --------------------------------------
					// Definition of Console Output
					System.out.println("-------------------------------- Begin Read JSON ----------------------------------");
					System.out.println("Das ist buffer: "+ buffer.toString());
					System.out.println("");
					
					// --------------------------------------
					// Return Value
					return buffer.toString();
					
					// --------------------------------------
					// The finally closing tag
				} finally {
					if (reader != null)
						reader.close();
				}
			}
