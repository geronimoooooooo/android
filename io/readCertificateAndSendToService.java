	class runPostMethod implements Runnable {
		public void run() {

			createHashMap();

			// ------------------------------------------------------------------------
			// Handling Strict Mode and Context
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
			Context apkcontext = getApplicationContext();

			// ------------------------------------------------------------------------
			// Handling Certificate via loading it from assets
			// folder within AssetManager
			try {
				InputStream ins = apkcontext.getAssets().open("Files/ispacevm26.crt");

				Certificate ca;
				CertificateFactory cf;
				try {
					cf = CertificateFactory.getInstance("X.509");
					try {
						ca = cf.generateCertificate(ins);
						System.out.println("ca="
								+ ((X509Certificate) ca).getSubjectDN());
					} finally {
						ins.close();
					}

					// ------------------------------------------------------------------------
					// Create a KeyStore containing our trusted CAs
					String keyStoreType = KeyStore.getDefaultType();
					KeyStore keyStore;
					keyStore = KeyStore.getInstance(keyStoreType);
					keyStore.load(null, null); // Initializing KeyStore
					keyStore.setCertificateEntry("ca", ca);

					// Create a TrustManager that trusts the CAs in our KeyStore
					String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
					TrustManagerFactory tmf;
					tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
					tmf.init(keyStore);

					// Create an SSLContext that uses our TrustManager
					SSLContext context = SSLContext.getInstance("TLS");
					context.init(null, tmf.getTrustManagers(), null);

					// ------------------------------------------------------------------------
					String postData = new String(objHashMap.toString());
					/** p.println("PostData:"+postData); **/
					// ------------------------------------------------------------------------

					// ------------------------------------------------------------------------
					// Connect to server, setting properties for connection
					// Send HashMap to Server --> Execution
					URL url = new URL("https://ispacevm26.researchstudio.at:6143/geoevent/rest/receiver/rest-positionMarker3/");
					HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
					connection.setSSLSocketFactory(context.getSocketFactory());
					connection.setRequestMethod("POST");
					connection.setDoOutput(true);
					connection.setRequestProperty("Content-Type", "application/json;charset=utf8");
					connection.setRequestProperty("Content-Length", String.valueOf(postData.length()));
					connection.setConnectTimeout(15000);

					DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
					wr.writeBytes(postData);
					wr.flush();
					wr.close();

					// ------------------------------------------------------------------------
					// Feedback to Console
					int responseCode = connection.getResponseCode();
					p.println("\nSending 'POST' request to URL: " + url);
					p.println("====================PostData Start================");
					p.println("Post parameters : \n" + postData);
					p.println("====================PostData Ende================");
					p.println("Response Code : " + responseCode);

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (KeyStoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CertificateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (KeyManagementException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // run
	} // class runPostMethod
