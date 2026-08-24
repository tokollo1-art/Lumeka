Lumeka Platform - Team Guidelines
🎯 Our Mission
Build a secure, scalable platform that connects young South Africans to economic opportunities through verified identity and trusted pathways.

📁 Repository Structure
Folder	Purpose
/docs	Architecture, API specs, security docs

/features	BDD feature files (Gherkin)	

/backend	Java Spring Boot application	

/frontend	Svelte + Node.js application

/ai-service	Python AI/ML service	

/infrastructure	Docker, Kubernetes, deployment	

/.github/workflows	CI/CD pipelines



🧪 Development Workflow (TDD/BDD)
Rule: ALWAYS write the test first.

Step-by-Step Process
Step   Who	What
1      QA	Write BDD scenario in .feature file

2      Team	Review scenario together

3      Developer	Write failing test (RED)

4      Developer	Write minimal code to pass (GREEN)

5      Developer	Refactor code (REFACTOR)

6      QA	Verify scenario passes

7      All	Commit and push


🔄 Git Workflow
Branch Naming

Branch Type/ Format	/Example

Feature	feature/short-description	feature/id-validation

Bug Fix	fix/short-description	fix/lockout-timer

Security	security/short-description	security/encryption-keys

Documentation	docs/short-description	docs/api-contract


Commit Messages
Format: <type>(<scope>): <message>

Types:

feat: New feature

fix: Bug fix

docs: Documentation

test: Tests only

security: Security fix

refactor: Code refactoring

chore: Build/tooling changes

Examples:

text
feat(identity): add SA ID validation endpoint

fix(lockout): reset counter on successful validation

security(audit): add immutable audit logging

test(id): add BDD scenarios for ID verification



Pull Request Process

Create branch from develop

Write code + tests

Push branch to GitHub

Open Pull Request against develop

Request review from at least 1 team member

Address review comments

Merge only after approval and CI passes

🧪 Testing Standards
Required Tests per Feature

Test Type	          Tool	                  Who Writes	            When
BDD Acceptance	    Cucumber.js	            QA         	            Before coding
Unit Tests	        JUnit (Java), Jest (JS)	Developer	              With code
Integration Tests	  Spring Test, Supertest	Developer	              With code
Security Tests	    Custom scripts	        Security-aware dev	    Before merge
Performance Tests	  JMeter / k6	            QA / DevOps	            Post-merge

Test Coverage Requirements
Target	Minimum
Unit test coverage	80%
Critical path coverage	100%
Security-sensitive code	100%


🔐 Security Guidelines
Data Protection
Never log PII (ID numbers, emails, phone numbers)

Always encrypt sensitive data (AES-256)

Always use TLS 1.3 for API communication

Always validate input (no SQL injection, XSS)

Always use parameterized queries

Credentials
Never commit secrets to repo

Use environment variables (.env) for secrets

Rotate keys regularly

Use different keys for dev/staging/prod

Access Control
Implement Role Based Access Control from day one

Least privilege principle (give only necessary access)

Audit all sensitive actions

Security Checks
Run security scan before every merge

Check for OWASP Top 10 vulnerabilities

Review dependencies for known vulnerabilities

🏗️ Code Review Standards
What to Check

Area	`        What to Look For
Security	     No PII logging, SQL injection, XSS, hardcoded secrets
Correctness	   Tests pass, scenarios covered, edge cases handled
Performance	   Database queries optimized, no N+1 queries
Readability	   Clear naming, comments where needed, consistent style
Testing	       Tests exist, cover edge cases, are they passing?
Documentation	 API contracts updated, inline docs where needed

Review Etiquette
Be respectful and constructive

Explain why you're suggesting a change

Accept that others may have different opinions

Review within 24 hours of request

🗣️ Communication
Tools
Purpose	         Tool
Code             repository	GitHub
CI/CD	           GitHub Actions
Documentation    GitHub Wiki / /docs folder
Communication    WhatsApp
Meetings	       Google Meet / Zoom


Retrospectives (Every 2 Weeks)
What went well?

What could be improved?

What will we try next?

📂 Documentation Standards
In Code
Public APIs: Always document with Javadoc (Java) or JSDoc (JS)

Complex logic: Explain why, not what (code already shows what)

Security decisions: Document the threat it mitigates

In Docs
Document	       Purpose	                    Format
Architecture	   System design, data flow	    Markdown + diagrams
API Contracts	   Request/response specs	      OpenAPI / Markdown
Security Model	 Threats and mitigations	    Markdown
Developer Guide	 Getting started, setup	      Markdown

✅ Definition of Done
A feature is done when:

□ BDD scenario written and approved
□ Code written with tests
□ All tests pass (unit, integration, security)
□ Code reviewed and approved
□ Documentation updated
□ API contract updated (if applicable)
□ No security vulnerabilities
□ Deployed to staging environment
□ Team lead has signed off


📝 Project Management
Tracking
Use GitHub Projects or Jira to track:

Column	        What Goes Here
Backlog	        Features not yet planned
Todo	          Planned for current sprint
In Progress	    Actively being worked on
Review	        In code review
Testing	        In QA testing
Done	          Deployed and verified

Sprint Length
2 weeks per sprint

Planning on first day

Review on last day

Retrospective after review


🔒 Code of Conduct
Be respectful of all team members

COMMUNICATE clearly and professionally

Take ownership of your work

ASK for HELP when STUCK

Document your decisions

Review code thoroughly and kindly

📚 Resources
OpenAPI Specification

Cucumber.js Documentation

Spring Boot Security

OWASP Top 10

POPIA Compliance Guide

