package com.tan.myswaggeruiexample.dto;

import com.tan.myswaggeruiexample.dto.shared.AbstractGenericDtoType;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Customer extends AbstractGenericDtoType {
  @ApiModelProperty(notes = "Customer Type")
  private String customerType;
  @ApiModelProperty(notes = "Customer Full Name")
  private String customerFullName;
}
