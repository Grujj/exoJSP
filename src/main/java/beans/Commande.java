package beans;

public class Commande {
	
	private String dateCommande;
	
	private Double montantCommande;
	
	private String modePaiementCommande;
	
	private String statutPaiementCommande;
	
	private String modeLivraisonCommande;
	
	private String statutLivraisonCommande;
	
	private Client client;
	
	public Commande() {}

	public Commande(String dateCommande, Double montantCommande, String modePaiementCommande,
			String statutPaiementCommande, String modeLivraisonCommande, String statutLivraisonCommande, Client client) {
		super();
		this.dateCommande = dateCommande;
		this.montantCommande = montantCommande;
		this.modePaiementCommande = modePaiementCommande;
		this.statutPaiementCommande = statutPaiementCommande;
		this.modeLivraisonCommande = modeLivraisonCommande;
		this.statutLivraisonCommande = statutLivraisonCommande;
		this.client = client;
	}

	public String getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Double getMontantCommande() {
		return montantCommande;
	}

	public void setMontantCommande(Double montantCommande) {
		this.montantCommande = montantCommande;
	}

	public String getModePaiementCommande() {
		return modePaiementCommande;
	}

	public void setModePaiementCommande(String modePaiementCommande) {
		this.modePaiementCommande = modePaiementCommande;
	}

	public String getStatutPaiementCommande() {
		return statutPaiementCommande;
	}

	public void setStatutPaiementCommande(String statutPaiementCommande) {
		this.statutPaiementCommande = statutPaiementCommande;
	}

	public String getModeLivraisonCommande() {
		return modeLivraisonCommande;
	}

	public void setModeLivraisonCommande(String modeLivraisonCommande) {
		this.modeLivraisonCommande = modeLivraisonCommande;
	}

	public String getStatutLivraisonCommande() {
		return statutLivraisonCommande;
	}

	public void setStatutLivraisonCommande(String statutLivraisonCommande) {
		this.statutLivraisonCommande = statutLivraisonCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Commande [dateCommande=" + dateCommande + ", montantCommande=" + montantCommande
				+ ", modePaiementCommande=" + modePaiementCommande + ", statutPaiementCommande="
				+ statutPaiementCommande + ", modeLivraisonCommande=" + modeLivraisonCommande
				+ ", statutLivraisonCommande=" + statutLivraisonCommande + ", client=" + client + "]";
	}

	
}
