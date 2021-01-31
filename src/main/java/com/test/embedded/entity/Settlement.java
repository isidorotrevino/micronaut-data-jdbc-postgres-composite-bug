package com.test.embedded.entity;

import io.micronaut.data.annotation.EmbeddedId;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;
import io.micronaut.data.annotation.Relation;

@MappedEntity("settlement")
public class Settlement
{
    @EmbeddedId
    protected SettlementPk id;
    @MappedProperty
    protected String description;
    @Relation(Relation.Kind.MANY_TO_ONE)
    protected SettlementType settlementType;
    @Relation(Relation.Kind.MANY_TO_ONE)
    protected Zone zone;
    @MappedProperty("is_enabled")
    protected Boolean enabled;
    
    public SettlementPk getId() {
        return this.id;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public SettlementType getSettlementType() {
        return this.settlementType;
    }
    
    public Zone getZone() {
        return this.zone;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setId(final SettlementPk id) {
        this.id = id;
    }
    
    public void setDescription(final String description) {
        this.description = description;
    }
    
    public void setSettlementType(final SettlementType settlementType) {
        this.settlementType = settlementType;
    }
    
    public void setZone(final Zone zone) {
        this.zone = zone;
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
        Settlement state = (Settlement) o;
        return this.getId().equals(state.getId());
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Settlement;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        final Object $enabled = this.getEnabled();
        result = result * 59 + (($enabled == null) ? 43 : $enabled.hashCode());
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $description = this.getDescription();
        result = result * 59 + (($description == null) ? 43 : $description.hashCode());
        final Object $settlementType = this.getSettlementType();
        result = result * 59 + (($settlementType == null) ? 43 : $settlementType.hashCode());
        final Object $zone = this.getZone();
        result = result * 59 + (($zone == null) ? 43 : $zone.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "Settlement(id=" + this.getId() + ", description=" + this.getDescription() + ", settlementType=" + this.getSettlementType() + ", zone=" + this.getZone() + ", enabled=" + this.getEnabled() + ")";
    }
}
