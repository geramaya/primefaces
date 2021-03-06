import javax.faces.component.UINamingContainer;

    public static final String CONTAINER_CLASS = "ui-selectmanymenu ui-inputfield ui-widget ui-widget-content ui-corner-all";
    public static final String ITEM_CLASS = "ui-selectlistbox-item ui-corner-all";

    public String getInputClientId() {
        return this.getClientId(getFacesContext()) + "_input";
    }

    public static String[] DOM_EVENTS = {
		"onchange",
		"onclick",
        "ondblclick"
	};