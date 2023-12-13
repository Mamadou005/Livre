public class Livre {
  
    private String titre, auteur;
    private int nbPages;
    
  public Livre(String unAuteur, String unTitre){
      auteur = unAuteur;
      titre = unTitre;
  }
  public String getAuteur(){
      return auteur;
  }
  public getTitre(){
      return titre;
  }
  public getNbPages(){
      return nbPages;
  }
  public setAuteur(String unTitre){
      auteur = unAuteur;
  }
  public setTitre(String unTitre){
      titre = unTitre;
  }
  public void setNbPages(int n){
      if(n >0){
          nbPages = n;
      }else {
          System.out.println("Erreur");
      }
  }
  public static void main(String[] args)
  {
      Livre Livre1 = new Livre("Auteur1");
      Livre Livre2 = new Livre("Auteur2");
          
          System.out.println("Auteur du livre 1 : " + livre1.getAuteur());
          System.out.println("Auteur du livre 2 : " + livre2.getAuteur());
          
          livre1.setNbPages = (100);
          livre2.setNbPages = (150);
          
              System.out.println("Le nombre de pages du livre 1 :" + livre1.getNbPages());
              System.out.println("Le nombre de pages du livre 2 :" + livre2.getNbPages());
              
          int nombrePagesTotal = livre1.getNbPages() + livre2.getNbPages();
              System.out.println("Le nombre total de pages des 2 livres sont :" + nombrePagesTotal);
              
  }

}
