package com.test.embedded.entity;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.MappedProperty;

@MappedEntity
public class SettlementType {
	@Id
	protected Integer id;
	@MappedProperty("set_type")
	protected String settlementType;
	@MappedProperty("is_enabled")
	protected Boolean enabled;

	public Integer getId() {
		return this.id;
	}

	public String getSettlementType() {
		return this.settlementType;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setSettlementType(final String settlementType) {
		this.settlementType = settlementType;
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
        SettlementType state = (SettlementType) o;
        return this.getId().equals(state.getId());
	}

	protected boolean canEqual(final Object other) {
		return other instanceof SettlementType;
	}

	@Override
	public int hashCode() {
		int result = 1;
		final Object $id = this.getId();
		result = result * 59 + (($id == null) ? 43 : $id.hashCode());
		final Object $enabled = this.getEnabled();
		result = result * 59 + (($enabled == null) ? 43 : $enabled.hashCode());
		final Object $settlementType = this.getSettlementType();
		result = result * 59 + (($settlementType == null) ? 43 : $settlementType.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "SettlementType(id=" + this.getId() + ", settlementType=" + this.getSettlementType() + ", enabled="
				+ this.getEnabled() + ")";
	}
}
