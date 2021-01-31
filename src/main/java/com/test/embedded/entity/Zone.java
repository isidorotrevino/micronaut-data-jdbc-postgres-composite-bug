package com.test.embedded.entity;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity("zone_type")
public class Zone
{
    @Id
    protected Integer id;
    @MappedProperty("zone_type")
    protected String zoneType;
    @MappedProperty("is_enabled")
    protected Boolean enabled;
    
    public Integer getId() {
        return this.id;
    }
    
    public String getZoneType() {
        return this.zoneType;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setZoneType(final String zoneType) {
        this.zoneType = zoneType;
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
        Zone zone = (Zone) o;
        return this.getId().equals(zone.getId());
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Zone;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $enabled = this.getEnabled();
        result = result * 59 + (($enabled == null) ? 43 : $enabled.hashCode());
        final Object $zoneType = this.getZoneType();
        result = result * 59 + (($zoneType == null) ? 43 : $zoneType.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Zone(id=" + this.getId() + ", zoneType=" + this.getZoneType() + ", enabled=" + this.getEnabled() + ")";
    }
}
