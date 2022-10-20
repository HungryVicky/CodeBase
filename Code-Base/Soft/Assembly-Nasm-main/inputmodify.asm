STDIN equ 0
STDOUT equ 1
SYS_WRITE equ 4
SYS_EXIT equ 1


section .data
	name db 'vicky programmer'

section .bss

	name_to_change resb 15

section .text
	global _start

_start:

	mov eax,3
	mov ebx,STDIN
	mov ecx,name_to_change
	mov edx,15

	int 0x80
		
	mov [name_to_change] , dword '****'

	mov eax,SYS_WRITE
	mov ebx,STDOUT
	mov ecx,name_to_change
	mov edx,15

	int 0x80

	mov eax,SYS_EXIT
	
	int 0x80