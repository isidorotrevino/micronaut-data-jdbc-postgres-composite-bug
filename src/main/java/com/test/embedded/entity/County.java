package com.test.embedded.entity;

import io.micronaut.data.annotation.EmbeddedId;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity
public class County
{
    @EmbeddedId
    protected CountyPk id;
    @MappedProperty
    protected String countyName;
    @MappedProperty("is_enabled")
    protected Boolean enabled;
    
    public CountyPk getId() {
        return this.id;
    }
    
    public String getCountyName() {
        return this.countyName;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setId(final CountyPk id) {
        this.id = id;
    }
    
    public void setCountyName(final String countyName) {
        this.countyName = countyName;
    }
    
    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }
    
    @Override
    public boolean equals(final Object o) {
    	if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        County state = (County) o;
        return this.getId().equals(state.getId());
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof County;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        final Object $enabled = this.getEnabled();
        result = result * 59 + (($enabled == null) ? 43 : $enabled.hashCode());
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $countyName = this.getCountyName();
        result = result * 59 + (($countyName == null) ? 43 : $countyName.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "County(id=" + this.getId() + ", countyName=" + this.getCountyName() + ", enabled=" + this.getEnabled() + ")";
    }
}
