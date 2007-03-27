package net.transformatorhuis.cgi.conversion;

import org.apache.log4j.Logger;

import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Vector;

import net.transformatorhuis.xsd.ObjectFactory;

/**
 * @author Olivier VAn Acker
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public abstract class AbstractRib {

    /**
     * Logger.
     */
    private static Logger logger = Logger.getLogger(AbstractRib.class);

    /* TODO: Improve this pattern.*/
    /**
     * Regular expression pattern.
     */
    private Pattern p = Pattern
            .compile("\"[\\w\\s.]*\"|\\[[\\p{Graph}\\p{Blank}]*\\]|[\\d\\p{Punct}]*'");

    /*
     * JAXB object factory for RIB elements
     */
    protected static ObjectFactory objFactory = new ObjectFactory();

    /**
     * Paramters.
     */
    private String param;

    /**
     * AbstractRib.
     */
    public AbstractRib() {
        this(null);
    }

    /**
     * AbstractRib.
     * @param param extra parameters
     */
    public AbstractRib(String param) {
        setParam(param);
    }

    /**
     * Return name of element based on class name without starting with 'Ri' and
     * ending with 'Begin' and in lower case.
     *
     * @return name of the element in lowercase
     */
    protected final String getElementName() {

        String className = this.getClass().getName();
        String elementName = className.substring(
                className.lastIndexOf(".Ri") + 3, className.length());
        if (hasChildElements()) {
            elementName = elementName
                    .substring(0, elementName.indexOf("Begin"));
        }
        logger.debug("Element name: " + elementName);
        return elementName.toLowerCase();

    }

    /**
     * Creates xml node. Most straight forward implementation, this class is
     * usually overwritten by sub class
     *
     * @param ribDoc -
     *            DOM xml document to add the xml to
     * @return xml piece for this element
     */
    public Node createXML(final RibDocument ribDoc) {

        Element ribRoot = ribDoc.requestElement(getElementName());
        if (param != null) {
            ribRoot.appendChild(ribDoc.requestTextNode(param));
        }

        return ribRoot;

    }

    /**
     * @return no child elements
     */
    public boolean hasChildElements() {
        return false;
    }

    /**
     * @return no end elements
     */
    public boolean isEndElement() {
        return false;
    }

    /**
     * Split up parameters and put them in a Vector.
     *
     * @param parameters -
     *            line with all parameters
     * @return vector with all parameters seperate
     */
    public Vector splitParameters(String parameters) {
        Vector parameterList = new Vector();
        Matcher m = p.matcher(parameters);

        while (m.find()) {
            if (m.start() != m.end()) {
                String match = m.group();
                logger.debug("Parameter: " + match);
                // Remove quotes
                if (match.startsWith("\"") && match.endsWith("\"")) {
                    match = match.substring(1, match.length() - 1);
                }
                parameterList.add(match);
            }
        }

        return parameterList;
    }

    /**
     * @param parameterList parameters
     * @param start start index
     */
    public void setParameters(Vector parameterList, int start) {

    }

    /**
     * @param param extra parameters
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
     * Abstract method to return
     * @return JAXB node returned for RIB element
     */
     abstract public Object getJAXBNode();

}
