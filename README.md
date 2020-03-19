# Personal-Processor
A MIPS-Architecture-like Experimental Processor and its Assembler Implementation

An experimental MIPS-like processor architecture has been implemented on Logisim.
Instruction are inspired from MIPS assembly.
An ANTLR-based assembler has been implemented in order to program processor. 
Assemler yields a myprocprogram.output. This file needs to be load into ROM memory of processor.
Processor documentation will be prepared later. LedBlink example turns on and off a led connected to port A of processor.  

Tools:
  - Eclipse Luna Service Release 2 (4.4.2)
  - Antlr 4.5.3
  - JavaSE 1.8
  
  Brief Project demonstration: https://youtu.be/Qz6nqFM-49U
  

immediate = [0-9]+
register = $[0-9]+
  
i_type (immediate) commands:

- movi command: mov $reg, immediate : reg = immediate
```
    movi $1, 22
    movi $2, 30
    movi $result, 25
    movi $sp, 34
```

- lui: load upper $reg, immediate :  reg = immediate << 16
```
lui $1, 25
lui $result, 36
lui $sp, 45
```
 - swi : store word $reg, immediate : RAM[immediate] = reg
```
movi $1, 25
movi $2, 55
swi $1, 0
swi $2, 1
swi $1, 128
```
- lwi : load word $reg, immediate : reg = RAM[immediate]
```
movi $1, 36
swi $1, 2
lwi $2, 2
lwi $4, 2
```
- addi: add $reg, intermediate, $result = reg + immediate
```
movi $1, 30
addi $1, 15
swi $result, 0
```


- bsf $reg, immediate : bit set $register, immediate : $result = $register | 1 << immediate, sets register bit depicted by immediate part and store result in $result register
```
movi $1, 8
bsf $1, 1
mov_fast $1, $result
```

- bcf $reg, immediate : bit clear $register, immediate : $result = $register & ~(1 << immediate), clears register bit depicted by immediate part and stores result in $result register
```
movi $1, 24
bcf $1, 3
mov_fast $1, $result
```

- get_bit $register, immediate : gets register bit depicted by immediate part, $result = ($register >> immediate) & 0x1
```
movi $1, 7
get_bit $1, 2
mov_fast $2, $result
```

- out $register, immediate : load Port register shown by immediate with register content
```
movi $1, 255
out $1, 1
out $1, 0
```

- in $register, immediate : read Port register shown by immediate and store it to $register
```
in $1, 2
```




r_tytpe commands: register type commands

- mov_fast: mov fast $reg1, $reg2 registers, reg1 = reg2
```
movi $1, 25
movi $2, 16
mov_fast $3, $1
mov_fast $4, $2
```

- sw: store word $reg1, $reg2 : RAM[$reg2] = $reg1
```
movi $1, 35
movi $2, 2
movi $3, 1
sw $1, $2,
sw $1, $3
```

- lw: load word $reg1, $reg2 : $reg1 = RAM[$reg2]
```
movi $1, 123
swi $1, 1

mov $2, 1
lw $3, $2
lw $4, $2
```

- add: add $reg1, $reg2 : $result = $reg1 + $reg2
```
movi $1, 35
movi $2, 25

add $1, $2
mov $3, $result
```


- sub: sub $reg1, $reg2 : $result = $reg1 - $reg2
```
movi $1, 25
movi $2, 16
sub $1, $2
mov_fast $3, $result
```

- slt: set if less than $reg1, $reg2 : $result = 1 if $reg1 < $reg2 else 0
```
movi $1, 2
movi $2, 16
slt $1, $2
mov_fast $3, $result
```

- and: and $reg1, $reg2 : $result = $reg1 & $reg2
```
movi $1, 15
movi $2, 20

and $1, $2
mov_fast $3, $result
```

- or: or $reg1, $reg2 : $result = $reg1 | $reg2
```
movi $1, 8
movi $2, 16
or $1, $2
mov_fast $3, $result
```


- shr: shift right $reg1, $reg2 : $result = $reg1 >> $reg2
```
movi $2, 2
mov $1, 16
shr $1, $2
mov_fast $4, $result
```


- mul: multiplication $reg1, $reg2 : $result = $reg1 * $reg2
```
movi $1, 16
movi $2, 16
mul  $1, $2
$mov $3, $result
```

- beq: branch equal $reg1, $reg2 : PC = PC+1 if $reg1 != $reg2(execute next command), PC = PC+2 if $reg1 == $reg2(skip next and continue execution) 
```
movi $1, 15
movi $2, 15
movi $3, 1
movi $4, 2

beq $1, $2
jmp notequal
jmp equal



notequal:
swi $3, 1
jmp finish

equal:
swi $4, 1
finish:
```


- bnq: branch when not equal $reg1, $reg2 : PC = PC+2 if $reg1 != $reg2(skip next and continue execution), PC = PC+1 if $reg1 == $reg2(execute next) 
(similar to PIC branch commands...)
```
movi $1, 15
movi $2, 16
movi $3, 1
movi $4, 2

bnq $1, $2
jmp equal
jmp notequal

equal:
swi $3, 1
jmp finish

notequal:
swi $4, 1


finish:
```




j_type: jump type commands


 - jmp label: jump to label
```
movi $1, 1
increase:
addi $1, 1
mov_fast $1, $result
swi $1, 1
jmp increase
```

- jmp immediate : jump to immediate address PC = immediate
```
jmp 11
movi $1, 10
movi $2, 15
jmp 10
```

- jmp $register : jump to address stored in register PC = $register
```
movi $1, 10
movi $2, 13
movi $3, 15
jmp $1
```


stack_type : Stack commands 

- push $reg : push $reg content ot RAM address pointed by $sp register and increase $sp register
RAM[$sp] = $reg, $sp = $sp+1
```

movi $2, 15
movi $1, 128

movi $sp, 5
push $1
push $2
```

- pop $reg : pop RAM address pointed by $sp register to given $reg, and decrease $sp value
```
movi $2, 15
movi $1, 128

movi $sp, 5
push $1
push $2

pop $4
pop $5
```
math_type: math commands

- incf $reg : increase $reg : $reg = $reg + 1
```
movi $1, 10
increase:
incf $1
jmp increase
```

- decf $reg : decrease $reg : $reg = $reg - 1
```
movi $1, 1000
decrease:
decf $1
jmp decrease
```


special commands:

- save_pc $register, store PC+1 value to $register
```
movi $1, 20
save_pc $2
```

- call label, call immediate : function call,  save PC(the address of first command after call) to RAM[$sp], increase $sp and jump to label or immediate address
```
mov $sp, 100

loop:
call deneme
addi $2, 1
mov_fast $2, $result

jmp loop

deneme:
call denemelik
return

denemelik:
addi $1, 1
mov_fast $1, $result
return
```

- return : return from function, decrease $sp by one, load $result with content in RAM[$sp], and set PC = $result
```
movi $sp, 100
movi $1, 10
loop:
call function
jmp loop


function:

addi $1, 1
mov_fast $1, $result

return
```

- nop : no operation, executes addi $0 , 0 instruction $result register is changed...


high level commands:

- mov [immediate1], [immediate2] : RAM[immediate1] = RAM[immdiate2]
```
movi $1, 25
movi $2, 50
movi $3, 5
swi $1, 0
mov [1],  [0]
mov [2], [1]
```


- mov [immediate], [$reg] : RAM[immediate] = RAM[$reg]
```
movi $1, 15
swi $1, 2
movi $2, 2
mov [5], [$2]
```

- mov [immediate], $reg : RAM[immediate] = $reg
```
movi $2, 123
mov [2], $2
```

- mov [immediate1], immediate2 : RAM[immediate1] = immediate2 
```
mov [3], 1024
```

- mov[$reg], [immediate] : RAM[$reg] = RAM[immediate]
```
movi $1, 25
swi $1, 2
mov$2, 3
mov [$2], [2]
```

- mov[$reg1], [$reg2] : RAM[$reg1] = RAM[$reg2]
```
mov $1, 125
swi $1, 1

movi $4, 3
movi $5, 1

mov [$4], [$5]
```


- mov[$reg1], $reg2 : RAM[$reg1] = $reg2
```
movi $3, 1
movi $1, 128
mov[$3], $1
```

- mov[$reg], immediate : RAM[$reg] = immediate
```
movi $1, 1
mov [$1] , 1027
```

- mov $reg, [immediate] : $reg = RAM[immediate]
```
movi $1, 128
swi $1, 2
mov $3, [2]
```

- mov $reg1, [$reg2] : $reg1 = RAM[$reg2]
```
movi $1, 128
swi $1, 3

movi $5, 3
mov $4, [$5]
```


- mov $reg1, $reg2 : $reg1 = $reg2
```
movi $1, 360
mov $2, $1
```

- mov $reg, immediate : $reg = immediate
```
mov $1, 120556
```


