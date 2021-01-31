package com.test.embedded.entity;

import io.micronaut.data.annotation.Embeddable;
import io.micronaut.data.annotation.MappedProperty;
import io.micronaut.data.annotation.Relation;

@Embeddable
public class CountyPk {
	
	@MappedProperty(value = "id")
	protected Integer id;
	
	@MappedProperty(value = "state_id")
	@Relation(Relation.Kind.MANY_TO_ONE)
	protected State state;

	public Integer getId() {
		return this.id;
	}

	public State getState() {
		return this.state;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

	public void setState(final State state) {
		this.state = state;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CountyPk state = (CountyPk) o;
		return this.getId().equals(state.getId()) && this.getState().getId().equals(state.getState().getId());
	}

	protected boolean canEqual(final Object other) {
		return other instanceof CountyPk;
	}

	@Override
	public int hashCode() {
		int result = 1;
		final Object $id = this.getId();
		result = result * 59 + (($id == null) ? 43 : $id.hashCode());
		final Object $state = this.getState();
		result = result * 59 + (($state == null) ? 43 : $state.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "CountyPk(id=" + this.getId() + ", state=" + this.getState() + ")";
	}
}
