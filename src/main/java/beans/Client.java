package beans;

public class Client {
	
	private String nomClient;
	
	private String prenomClient;
	
	private String adresseClient;
	
	private String telephoneClient;
	
	private String emailClient;
	
	public Client() {}

	public Client(String nomClient, String prenomClient, String adresseClient, String telephoneClient,
			String emailClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresseClient = adresseClient;
		this.telephoneClient = telephoneClient;
		this.emailClient = emailClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public String getTelephoneClient() {
		return telephoneClient;
	}

	public void setTelephoneClient(String telephoneClient) {
		this.telephoneClient = telephoneClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	@Override
	public String toString() {
		return "Client [nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", adresseClient=" + adresseClient
				+ ", telephoneClient=" + telephoneClient + ", emailClient=" + emailClient + "]";
	}
}
