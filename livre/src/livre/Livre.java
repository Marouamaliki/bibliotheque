package livre;

public class Livre {
	private String titre;
	private String auteur;
	private int annee_publication;
	
	public Livre(String titre, String auteur , int annee_publication) {
		this.titre=titre;
		this.auteur=auteur;
		this.annee_publication=annee_publication;
	}
public class Bibliotheque{
	
	
}

	public void afficherDetails() {
		System.out.print("le titre de livre est "+titre+" le nom d'auteur "+auteur+" l'année de publication est "+annee_publication);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre livre1 = new Livre("les misérables","victor hugo",1862);
		livre1.afficherDetails();

	}

}
