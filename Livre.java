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
  public String getTitre(){
      return titre;
  }
  public int getNbPages(){
      return nbPages;
  }
  public void setAuteur(String unAuteur){
      auteur = unAuteur;
  }
  public void setTitre(String unTitre){
      titre = unTitre;
  }
  public void setNbPages(int n){
      if(n > 0){
          nbPages = n;
      }else {
          System.out.println("Erreur");
      }
  }
  public static void main(String[] args)
  {
      Livre livre1 = new 
      Livre("Auteur1" ,"Titre1");
      Livre livre2 = 
      new Livre("Auteur2" , "Titre1");
                   
          livre1.setNbPages(100);
          livre2.setNbPages(150);
          
          System.out.println("Auteur du livre 1 : " + livre1.getAuteur());
          System.out.println("Auteur du livre 2 : " + livre2.getAuteur());
 
          
              System.out.println("Le nombre de pages du livre 1 :" + livre1.getNbPages());
              System.out.println("Le nombre de pages du livre 2 :" + livre2.getNbPages());
              
          int nombrePagesTotal = livre1.getNbPages() + livre2.getNbPages();
              System.out.println("Le nombre total de pages des 2 livres sont :" + nombrePagesTotal);
              
  }

}
