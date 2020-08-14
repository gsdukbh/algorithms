Python3 
===

****

````python
stack = []
        judge = {'()','[]','{}'}
        for i in s:
            if not stack: 
                stack.append(i)
            else:
                if stack[-1]+i in judge:
                    stack.pop()
                else:
                    stack.append(i)
                    
        return stack == []

````