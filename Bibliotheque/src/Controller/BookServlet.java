package Controller;

import Model.Bibliotheque;
import Model.Livre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    private Bibliotheque bibliotheque;

    @Override
    public void init() throws ServletException {
        bibliotheque = new Bibliotheque();
        bibliotheque.ajouterLivre(new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupéry", "123456789", "disponible"));
        bibliotheque.ajouterLivre(new Livre(2, "1984", "George Orwell", "987654321", "disponible"));
        bibliotheque.ajouterLivre(new Livre(3, "Les Misérables", "Victor Hugo", "456123789", "disponible"));
        bibliotheque.ajouterLivre(new Livre(4, "Le Comte de Monte-Cristo", "Alexandre Dumas", "321654987", "disponible"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("getAll".equals(action)) {
            List<Livre> livres = bibliotheque.getAllLivres();
            request.setAttribute("livres", livres);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            // Autres actions
        }
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("ajouter".equals(action)) {
            String titre = request.getParameter("titre");
            String auteur = request.getParameter("auteur");
            String isbn = request.getParameter("isbn");
            String statut = "disponible";
            int id = bibliotheque.getAllLivres().size() + 1; // Simplification pour générer un ID unique
            Livre livre = new Livre(id, titre, auteur, isbn, statut);
            bibliotheque.ajouterLivre(livre);
            response.sendRedirect("BookServlet?action=getAll");
        } else if ("supprimer".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            bibliotheque.supprimerLivre(id);
            response.sendRedirect("BookServlet?action=getAll");
        } else if ("modifier".equals(action)) {
            int id = Integer.parseInt(request.getParameter("id"));
            String titre = request.getParameter("titre");
            String auteur = request.getParameter("auteur");
            String isbn = request.getParameter("isbn");
            String statut = request.getParameter("statut");
            Livre livre = new Livre(id, titre, auteur, isbn, statut);
            bibliotheque.modifierLivre(livre);
            response.sendRedirect("BookServlet?action=getAll");
        } else {
            // Autres actions
        }
    }
}
