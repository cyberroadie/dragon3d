//
//  Rib.java
//  RendermanXML
//
//  Created by Olivier Van Acker on Wed Dec 24 2003.
//  Copyright (c) 2003 __MyCompanyName__. All rights reserved.
//

public abstract class Rib {

    private String riName;
    
    public Rib(String ribElement, String riName) {
        this.riName = riName;
    }
    
    public String getElement() {
        return "<" + riName + setAttributes() + ">" + setBody() + "</" + riName + ">";
    }

    private String setAttributes() {

    }
    
}
