package com.test.embedded.entity;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity("mx_state")
public class State
{
    @Id
    protected Integer id;
    @MappedProperty
    protected String stateName;
    @MappedProperty("is_enabled")
    protected Boolean enabled;
    
    public Integer getId() {
        return this.id;
    }
    
    public String getStateName() {
        return this.stateName;
    }
    
    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setId(final Integer id) {
        this.id = id;
    }
    
    public void setStateName(final String stateName) {
        this.stateName = stateName;
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
        State state = (State) o;
        return this.getId().equals(state.getId());
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof State;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        final Object $id = this.getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        final Object $enabled = this.getEnabled();
        result = result * 59 + (($enabled == null) ? 43 : $enabled.hashCode());
        final Object $stateName = this.getStateName();
        result = result * 59 + (($stateName == null) ? 43 : $stateName.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "State(id=" + this.getId() + ", stateName=" + this.getStateName() + ", enabled=" + this.getEnabled() + ")";
    }
}
