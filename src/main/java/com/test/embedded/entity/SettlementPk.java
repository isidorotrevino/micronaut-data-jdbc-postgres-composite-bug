package com.test.embedded.entity;

import io.micronaut.data.annotation.Embeddable;
import io.micronaut.data.annotation.MappedProperty;
import io.micronaut.data.annotation.Relation;

@Embeddable
public class SettlementPk
{
    @MappedProperty(value="code")
    protected String code;
    
    @MappedProperty(value="code_id")
    protected Integer codeId;
    
//    @MappedProperty(value="county_id\",\"state_id")
    @Relation(value= Relation.Kind.MANY_TO_ONE,mappedBy = "id")
    protected County county;
    
    public String getCode() {
        return this.code;
    }
    
    public Integer getCodeId() {
        return this.codeId;
    }
    
    public County getCounty() {
        return this.county;
    }
    
    public void setCode(final String code) {
        this.code = code;
    }
    
    public void setCodeId(final Integer codeId) {
        this.codeId = codeId;
    }
    
    public void setCounty(final County county) {
        this.county = county;
    }
    
    @Override
    public boolean equals(final Object o) {
    	if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SettlementPk state = (SettlementPk) o;
		return this.getCodeId().equals(state.getCodeId()) && this.getCounty().getId().equals(state.getCounty().getId())
				&& this.getCode().equals(state.getCode());
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof SettlementPk;
    }
    
    @Override
    public int hashCode() {
        int result = 1;
        final Object $codeId = this.getCodeId();
        result = result * 59 + (($codeId == null) ? 43 : $codeId.hashCode());
        final Object $code = this.getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        final Object $county = this.getCounty();
        result = result * 59 + (($county == null) ? 43 : $county.hashCode());
        return result;
    }
    
    @Override
    public String toString() {
        return "SettlementPk(code=" + this.getCode() + ", codeId=" + this.getCodeId() + ", county=" + this.getCounty() + ")";
    }
}
