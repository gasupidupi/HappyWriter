// DO NOT EDIT.  Make changes to Konfiguration.java instead.
package your.app.eo;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;

import er.extensions.eof.*;
import er.extensions.eof.ERXKey.Type;
import er.extensions.foundation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public abstract class _Konfiguration extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Konfiguration";

  // Attribute Keys

  // Relationship Keys
  public static final ERXKey<Artikel> ARTIKEL = new ERXKey<Artikel>("artikel", Type.ToOneRelationship);
  public static final ERXKey<Inhalt> INHALT = new ERXKey<Inhalt>("inhalt", Type.ToOneRelationship);

  // Attributes

  // Relationships
  public static final String ARTIKEL_KEY = ARTIKEL.key();
  public static final String INHALT_KEY = INHALT.key();

  private static final Logger log = LoggerFactory.getLogger(_Konfiguration.class);

  public Konfiguration localInstanceIn(EOEditingContext editingContext) {
    Konfiguration localInstance = (Konfiguration)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Artikel artikel() {
    return (Artikel)storedValueForKey(_Konfiguration.ARTIKEL_KEY);
  }

  public void setArtikel(Artikel value) {
    takeStoredValueForKey(value, _Konfiguration.ARTIKEL_KEY);
  }

  public void setArtikelRelationship(Artikel value) {
    log.debug("updating artikel from {} to {}", artikel(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setArtikel(value);
    }
    else if (value == null) {
      Artikel oldValue = artikel();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Konfiguration.ARTIKEL_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _Konfiguration.ARTIKEL_KEY);
    }
  }

  public Inhalt inhalt() {
    return (Inhalt)storedValueForKey(_Konfiguration.INHALT_KEY);
  }

  public void setInhalt(Inhalt value) {
    takeStoredValueForKey(value, _Konfiguration.INHALT_KEY);
  }

  public void setInhaltRelationship(Inhalt value) {
    log.debug("updating inhalt from {} to {}", inhalt(), value);
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
      setInhalt(value);
    }
    else if (value == null) {
      Inhalt oldValue = inhalt();
      if (oldValue != null) {
        removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Konfiguration.INHALT_KEY);
      }
    } else {
      addObjectToBothSidesOfRelationshipWithKey(value, _Konfiguration.INHALT_KEY);
    }
  }


  public static Konfiguration createKonfiguration(EOEditingContext editingContext, Artikel artikel, Inhalt inhalt) {
    Konfiguration eo = (Konfiguration) EOUtilities.createAndInsertInstance(editingContext, _Konfiguration.ENTITY_NAME);
    eo.setArtikelRelationship(artikel);
    eo.setInhaltRelationship(inhalt);
    return eo;
  }

  public static ERXFetchSpecification<Konfiguration> fetchSpec() {
    return new ERXFetchSpecification<Konfiguration>(_Konfiguration.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<Konfiguration> fetchAllKonfigurations(EOEditingContext editingContext) {
    return _Konfiguration.fetchAllKonfigurations(editingContext, null);
  }

  public static NSArray<Konfiguration> fetchAllKonfigurations(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Konfiguration.fetchKonfigurations(editingContext, null, sortOrderings);
  }

  public static NSArray<Konfiguration> fetchKonfigurations(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<Konfiguration> fetchSpec = new ERXFetchSpecification<Konfiguration>(_Konfiguration.ENTITY_NAME, qualifier, sortOrderings);
    NSArray<Konfiguration> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static Konfiguration fetchKonfiguration(EOEditingContext editingContext, String keyName, Object value) {
    return _Konfiguration.fetchKonfiguration(editingContext, ERXQ.equals(keyName, value));
  }

  public static Konfiguration fetchKonfiguration(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<Konfiguration> eoObjects = _Konfiguration.fetchKonfigurations(editingContext, qualifier, null);
    Konfiguration eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Konfiguration that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Konfiguration fetchRequiredKonfiguration(EOEditingContext editingContext, String keyName, Object value) {
    return _Konfiguration.fetchRequiredKonfiguration(editingContext, ERXQ.equals(keyName, value));
  }

  public static Konfiguration fetchRequiredKonfiguration(EOEditingContext editingContext, EOQualifier qualifier) {
    Konfiguration eoObject = _Konfiguration.fetchKonfiguration(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Konfiguration that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static Konfiguration localInstanceIn(EOEditingContext editingContext, Konfiguration eo) {
    Konfiguration localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
}
