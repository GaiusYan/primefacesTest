/* package com.application.test;
import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;


public class AppConfig implements PhaseListener{

     // Méthode de configuration des thèmes de PrimeFaces et JSF
     public void init() {
        // Configuration de PrimeFaces
        FacesContext context = FacesContext.getCurrentInstance();
        Application application = context.getApplication();
        
        // Définir le thème de PrimeFaces
        //application.getAttributes().put("primefaces.THEME", "bluesky"); // Choisir un thème, ex. "bluesky", "nova-light"
        
        // Vous pouvez configurer des éléments supplémentaires de JSF ici, si nécessaire
    }

    // Méthode PhaseListener pour écouter et appliquer les paramètres de thème à chaque requête JSF
    @Override
    public void beforePhase(PhaseEvent event) {
        // Cette méthode peut être utilisée pour appliquer une logique avant chaque phase du cycle de vie JSF
        FacesContext context = FacesContext.getCurrentInstance();
        
        // Exemple d'ajout d'un message global de bienvenue
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenue sur notre site", "Utilisez les fonctionnalités ci-dessous."));
    }

    @Override
    public void afterPhase(PhaseEvent event) {
        // Cette méthode peut être utilisée pour effectuer des actions après chaque phase du cycle de vie JSF
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }
}
 */