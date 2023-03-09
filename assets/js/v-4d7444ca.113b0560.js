(self.webpackChunkdocs=self.webpackChunkdocs||[]).push([[8704],{676:(n,s,a)=>{"use strict";a.r(s),a.d(s,{data:()=>p});const p={key:"v-4d7444ca",path:"/leetcode/IsSameTree.html",title:"",lang:"zh-CN",frontmatter:{},excerpt:"",headers:[{level:2,title:"相同的树",slug:"相同的树",children:[]}],filePathRelative:"leetcode/IsSameTree.md",git:{updatedTime:1622450691e3,contributors:[]}}},6320:(n,s,a)=>{"use strict";a.r(s),a.d(s,{default:()=>e});const p=(0,a(6252).uE)('<h2 id="相同的树"><a class="header-anchor" href="#相同的树">#</a> 相同的树</h2><h5 id="思路-深度遍历判断两颗树是否一致。"><a class="header-anchor" href="#思路-深度遍历判断两颗树是否一致。">#</a> 思路； 深度遍历判断两颗树是否一致。</h5><p><a href="../../../leetcode/app/src/main/java/top/werls/leetcode/IsSameTree.java">代码</a></p><div class="language-java ext-java line-numbers-mode"><pre class="language-java"><code><span class="token keyword">public</span> <span class="token keyword">boolean</span> <span class="token function">isSameTree</span><span class="token punctuation">(</span><span class="token class-name">TreeNode</span> p<span class="token punctuation">,</span> <span class="token class-name">TreeNode</span> q<span class="token punctuation">)</span> <span class="token punctuation">{</span>\n        <span class="token keyword">if</span> <span class="token punctuation">(</span>p <span class="token operator">==</span> <span class="token keyword">null</span> <span class="token operator">&amp;&amp;</span> q <span class="token operator">==</span> <span class="token keyword">null</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>\n            <span class="token keyword">return</span> <span class="token boolean">true</span><span class="token punctuation">;</span>\n        <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token keyword">if</span> <span class="token punctuation">(</span>p <span class="token operator">==</span> <span class="token keyword">null</span> <span class="token operator">||</span> q <span class="token operator">==</span> <span class="token keyword">null</span> <span class="token operator">||</span> q<span class="token punctuation">.</span>val <span class="token operator">!=</span> p<span class="token punctuation">.</span>val<span class="token punctuation">)</span> <span class="token punctuation">{</span>\n            <span class="token keyword">return</span> <span class="token boolean">false</span><span class="token punctuation">;</span>\n        <span class="token punctuation">}</span> <span class="token keyword">else</span> <span class="token punctuation">{</span>\n            <span class="token keyword">return</span> <span class="token function">isSameTree</span><span class="token punctuation">(</span>p<span class="token punctuation">.</span>left<span class="token punctuation">,</span> q<span class="token punctuation">.</span>left<span class="token punctuation">)</span> <span class="token operator">&amp;&amp;</span> <span class="token function">isSameTree</span><span class="token punctuation">(</span>p<span class="token punctuation">.</span>right<span class="token punctuation">,</span> q<span class="token punctuation">.</span>right<span class="token punctuation">)</span><span class="token punctuation">;</span>\n        <span class="token punctuation">}</span>\n    <span class="token punctuation">}</span>\n</code></pre><div class="line-numbers"><span class="line-number">1</span><br><span class="line-number">2</span><br><span class="line-number">3</span><br><span class="line-number">4</span><br><span class="line-number">5</span><br><span class="line-number">6</span><br><span class="line-number">7</span><br><span class="line-number">8</span><br><span class="line-number">9</span><br></div></div>',4),e={render:function(n,s){return p}}}}]);