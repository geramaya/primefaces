import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.component.UIParameter;
import java.util.Map;
import javax.faces.event.ActionEvent;

	public void decode(FacesContext facesContext) {
		Map<String,String> params = facesContext.getExternalContext().getRequestParameterMap();
		String clientId = getClientId(facesContext);
		
		if(params.containsKey(clientId)) {
			this.queueEvent(new ActionEvent(this));
		}
	}
	
	public boolean shouldRenderChildren() {
		if(getChildCount() == 0)
			return false;
		else {
			for(UIComponent child : getChildren()) {
				if(! (child instanceof UIParameter) ) {
					return true;
				}
			}
		}
		
		return false;
	}

    public boolean isPartialSubmitSet() {
        return (getStateHelper().get(PropertyKeys.partialSubmit) != null) || (this.getValueExpression("partialSubmit") != null); 
    }

    public String getHref() {
        return this.getUrl();
    }

    public boolean isDynamic() {
        return false;
    }

    public Map<String, List<String>> getParams() {
        throw new UnsupportedOperationException("Not supported yet.");
    }